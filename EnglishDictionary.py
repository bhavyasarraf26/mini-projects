from PyDictionary import PyDictionary
obj = PyDictionary()
word = input("Enter a word...\n")
print("Meaning ---> ",obj.meaning(word))
print("Synonyms ---> ",obj.synonym(word))
print("Antonyms ---> ",obj.antonym(word))
print("Translation in hindi ---> ",obj.translate(word,"hi"))
