def concat(a,b):
    return a + b

age = 36
txt = "My name is John, and I am {}"
print(txt.format(age))

txt = "   My name is John, and I am {} "
print(txt.strip())

x = map(concat, ('aniket', 'acharya'), ('go', 'let'))
result = list(x)
print(result)

print([i.strip() for i in result])

fruits = ['apple', 'banana', 'cherry']

points = (1, 4, 5, 9)

fruits.extend(points)

print(fruits)

txt = "aniketanicharya30gmailcom"
print(txt.capitalize)
print(txt.casefold)
txt1="aniketacharya30@gmail.com"
f=txt.index("ni")
f1=txt.find("ni")
f2=txt.count("ani")
x = txt.isalnum()
y=txt1.isalnum()
print(x)
print(y)
print(f)
print(f1)
print(f2)