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