import os, shutil, sys

# Removes any previously compiled code, in case the code doesn't compile
if (os.path.isfile("/home/codio/workspace/.guides/secure/BalancedParen.class")):
  os.remove("/home/codio/workspace/.guides/secure/BalancedParen.class")
if (os.path.isfile("/home/codio/workspace/.guides/secure/BalancedParen.java")):
  os.remove("/home/codio/workspace/.guides/secure/BalancedParen.java")

# path to student file
student_file = "/home/codio/workspace/code/BalancedParen.java" 

# new location for testing
new_location = "/home/codio/workspace/.guides/secure" 

# copy student file to the new location
shutil.copy(student_file, new_location)

# run the code test on student file
os.system("chmod +x .guides/secure/paren.sh")
result = os.system(".guides/secure/paren.sh")

# Return the exit code to the Guide for the red "X" or green check mark
if result == 0:
    sys.exit(0)
else:
    sys.exit(1)