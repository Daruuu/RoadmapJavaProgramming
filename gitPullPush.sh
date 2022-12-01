#!/bin/bash
#script to automate my git push in every git repository
# read -r is because don't let the backslash \() act as an scape character and broke the script
# before execute this script, change the permission using: chmod +x gitpushV1.sh|| chmod 755 gitpushV1.sh

git status
git add .
  echo "Insert the commit message:"
	read -r COMMITMESSAGE
git commit -m "$COMMITMESSAGE"
  echo "pull OR push:"
  read -r RESPUESTA
  if [[ $RESPUESTA == "pull" ]]; then
    git pull
    echo "Pull done, do you want to PUSH your files (y/n)?"
    read -r PUSHINPUT
    if [[ $PUSHINPUT == "y" ]]; then
        echo "Insert the name of the branch (main):"
        read -r BRANCH
        git push origin $BRANCH
        echo "<<<<<<<<<<REPOSITORY UPDATED SUCCESSFUL>>>>>>>>>>"
        git log -n 2
    else
        exit;
    fi
  elif [[ $RESPUESTA == "push" ]]; then
    echo "Insert the name of the branch (main):"
      read -r BRANCH
    git push origin $BRANCH
    read -r
    echo "<<<<<<<<<<REPOSITORY UPDATED SUCCESSFUL>>>>>>>>>>"
    git log -n 3
  fi
