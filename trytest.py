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