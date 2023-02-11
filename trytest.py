try:
  f = open("test.txt", "w")
  try:
    f.write("Lorem Ipsum")
  except:
    print("Something went wrong when writing to the file")
  finally:
    f.close()
except:
  print("Something went wrong when opening the file")

print("The code has finished executing.")

a = "MyFolder"
b = "Demo002"
c = "2bring"
d = "my demo"

print(a.isidentifier())
print(b.isidentifier())
print(c.isidentifier())
print(d.isidentifier())


thistuple = ("apple", "banana", "cherry")
print(len(thistuple))

tuple1 = ("abc", 34, True, 40, "male")

print(tuple1)

thistuple = ("apple", "banana", "cherry", "orange", "kiwi", "melon", "mango")
l = thistuple[-7:-1]
p = list(reversed(l))
print(p)

fruits = ("apple", "banana", "cherry")

(green, yellow, red) = fruits

print(green)
print(yellow)
print(red)

thistuple = ("apple", "banana", "cherry")
for i,index in enumerate(thistuple):
  print(i)
  print(index)