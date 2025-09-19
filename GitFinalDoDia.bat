@echo off
REM Pede para o usuário digitar a mensagem do commit
set /p commitMessage=Digite a mensagem do commit: 

REM Adiciona todos os arquivos
git add .

REM Faz o commit com a mensagem digitada
git commit -m "%commitMessage%"

REM Envia para o repositório remoto na branch main
git push -u origin main