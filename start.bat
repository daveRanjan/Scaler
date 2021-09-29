@echo off

set /p branch_name="Enter branch name :- "

git checkout main
git checkout -b "%branch_name%"