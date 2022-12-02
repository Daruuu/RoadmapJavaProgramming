#!/bin/bash
#script to automate my git push in every git repository
git status
git add .
  echo "Enter the commit message:"
	read -r COMMITMESSAGE
git commit -m "$COMMITMESSAGE"
	echo  "Enter the name of the branch (main):"
	read -r BRANCH
git push origin "$BRANCH"
#	read -r
	echo "<<<<<<<<<<<<<<<REPOSITORY UPDATED SUCCESFUL!!>>>>>>>>>>>>>>>"
git log -n 3
