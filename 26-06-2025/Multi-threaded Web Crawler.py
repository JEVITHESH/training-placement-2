import requests, threading
from queue import Queue
from bs4 import BeautifulSoup

def worker():
    while True:
        url = q.get()
        try:
            resp = requests.get(url, timeout=5)
            # parse resp.text...
        except:
            pass
        q.task_done()

q = Queue()
for _ in range(10):
    t = threading.Thread(target=worker, daemon=True)
    t.start()

q.put("https://example.com")
q.join()
