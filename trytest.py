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

def myfunc():
  x = 300
  def myinnerfunc():
    print(x)
  print("hello")
  myinnerfunc()
  

myfunc()

def fun(lis,p):
  if(len(lis)!=len(p)):
    print("duplicates are found")
  else:
    print("not found")


lis=[2,3,5,6,7,2,2,4]
p=set(lis)
fun(lis,p)
l21=[[60,80,90],[10,30]]
for i in range(len(l21)):
  print(i)
s="sumit Anand uemk"
s1=""
for i in s:
    if( i not in " aeiou" and i not in "AEIOU" and i not in s1):
        s1 +=i 
print(s1, len(s1))

s="geeks"
s1=list(s)
print(s1)
for i in range(2,len(s1)):
    print(i)
l=s1.count("e")
print(l)

l1=(20,30,10,60)
l3=str(l1)
print(type(l3))
l2=sorted(l1,reverse=True)
print(l2)