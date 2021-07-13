import os, shutil, sys

# Removes any previously compiled code, in case the code doesn't compile
if (os.path.isfile("/home/codio/workspace/.guides/secure/CreateQueue.class")):
  os.remove("/home/codio/workspace/.guides/secure/CreateQueue.class")
if (os.path.isfile("/home/codio/workspace/.guides/secure/CreateQueue.java")):
  os.remove("/home/codio/workspace/.guides/secure/CreateQueue.java")
if (os.path.isfile("/home/codio/workspace/.guides/secure/DIYQueue.class")):
  os.remove("/home/codio/workspace/.guides/secure/DIYQueue.class")
if (os.path.isfile("/home/codio/workspace/.guides/secure/Node.class")):
  os.remove("/home/codio/workspace/.guides/secure/Node.class")

student_file = "/home/codio/workspace/code/CreateQueue.java"

new_loc = "/home/codio/workspace/.guides/secure"

shutil.copy(student_file, new_loc)

result = os.system("sh /home/codio/workspace/.guides/secure/queues.sh")

if result == 0:
  sys.exit(0)
else:
  sys.exit(1)