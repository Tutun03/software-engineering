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
print(txt.isupper)
print(txt.islower)
print('#'.join(txt))
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
myDict = ['aniket','tutun','ratan']
mySeparator = "TEST"
for i,index in enumerate(myDict):
    
    print(str(i).join(myDict))



print(x)
x = "hello"

if  type(x) is not  int:
  raise Exception("Only integers are allowed")

x = -1
if x < 0:
  raise Exception("Sorry, no numbers below zero")

#The finally block gets executed no matter if the try block raises any errors or not:
x=45
try:
  print(x)
except:
  print("Something went wrong")
finally:
  print("The 'try except' is finished")