#script to automate my respository update with MAKRFILE
run:
	git status
	git add .
		@echo "Add the commit message:"; \
	read COMMITMESSAGE; \
	git commit -m " $$COMMITMESSAGE "
		@echo "Enter the name of branch (main)"; \
	read BRANCH; \
	git push origin $$BRANCH; \
		echo "<<<<<<<<<<--- REPOSITORY UPDATED SUCCESFUL!! --->>>>>>>>>>"
	git log -n 3
