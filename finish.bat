@echo off
set /p message="Enter message name :- "

git status
git commit -am "%message%"
git push

start.bat