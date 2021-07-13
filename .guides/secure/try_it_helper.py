import os, shutil, sys

student_file = "/home/codio/workspace/code/ArrayConversion.java"

new_loc = "/home/codio/workspace/.guides/secure"

shutil.copy(student_file, new_loc)

result = os.system("sh /home/codio/workspace/.guides/secure/runArrayConversion.sh")

if result == 0:
  sys.exit(0)
else:
  sys.exit(1)