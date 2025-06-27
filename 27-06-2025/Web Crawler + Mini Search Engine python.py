import requests
from bs4 import BeautifulSoup
from collections import defaultdict

index = defaultdict(set)
def crawl(seed, depth):
    seen = set([seed])
    queue = [(seed, 0)]
    while queue:
        url, d = queue.pop(0)
        if d > depth: continue
        resp = requests.get(url)
        soup = BeautifulSoup(resp.text, "html.parser")
        text = soup.get_text().split()
        for w in set(text):
            index[w.lower()].add(url)
        for a in soup.find_all("a", href=True):
            link = requests.compat.urljoin(url, a['href'])
            if link not in seen:
                seen.add(link)
                queue.append((link, d+1))
