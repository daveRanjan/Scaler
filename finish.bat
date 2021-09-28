@echo off
set /p message="Enter message name :- "

git status
git commit -am "%message%"

start.bat