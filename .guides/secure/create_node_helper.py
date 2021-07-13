import os, shutil, sys

# Removes any previously compiled code, in case the code doesn't compile
if (os.path.isfile("/home/codio/workspace/.guides/secure/CreateNode.class")):
  os.remove("/home/codio/workspace/.guides/secure/CreateNode.class")
if (os.path.isfile("/home/codio/workspace/.guides/secure/CreateNode.java")):
  os.remove("/home/codio/workspace/.guides/secure/CreateNode.java")
if (os.path.isfile("/home/codio/workspace/.guides/secure/Node.class")):
  os.remove("/home/codio/workspace/.guides/secure/Node.class")

student_file = "/home/codio/workspace/code/CreateNode.java"

new_loc = "/home/codio/workspace/.guides/secure"

shutil.copy(student_file, new_loc)

result = os.system("/home/codio/workspace/.guides/secure/create_node.sh")

if result == 0:
  sys.exit(0)
else:
  sys.exit(1)