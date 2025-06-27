import PyPDF2, pyttsx3

def pdf_to_audio(pdf_path, audio_path):
    reader = PyPDF2.PdfReader(pdf_path)
    text = ""
    for p in reader.pages:
        text += p.extract_text()
    engine = pyttsx3.init()
    engine.save_to_file(text, audio_path)
    engine.runAndWait()

if __name__ == "__main__":
    pdf_to_audio("book.pdf", "book.mp3")
