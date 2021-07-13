import os, shutil, sys

# Removes any previously compiled code, in case the code doesn't compile
if (os.path.isfile("/home/codio/workspace/.guides/secure/StackMain.class")):
  os.remove("/home/codio/workspace/.guides/secure/StackMain.class")
if (os.path.isfile("/home/codio/workspace/.guides/secure/StackMain.java")):
  os.remove("/home/codio/workspace/.guides/secure/StackMain.java")
if (os.path.isfile("/home/codio/workspace/.guides/secure/DIYStack.class")):
  os.remove("/home/codio/workspace/.guides/secure/DIYStack.class")
if (os.path.isfile("/home/codio/workspace/.guides/secure/Node.class")):
  os.remove("/home/codio/workspace/.guides/secure/Node.class")

student_file = "/home/codio/workspace/code/StackMain.java"

new_loc = "/home/codio/workspace/.guides/secure"

shutil.copy(student_file, new_loc)

result = os.system("sh /home/codio/workspace/.guides/secure/stacks.sh")

if result == 0:
  sys.exit(0)
else:
  sys.exit(1)