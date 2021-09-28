@echo off
set /p reset_required="Reset Required? "

if "%reset_required%"=="y" finish.bat

set /p branch_name="Enter branch name :- "

git checkout main
git checkout -b %branch_name%