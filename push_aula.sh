#!/bin/bash

# Define a mensagem de commit com a data atual
COMMIT_MSG="Aula do dia $(date +%Y-%m-%d)"

# Adiciona todos os arquivos
git add .

# Cria o commit com a mensagem definida
git commit -m "$COMMIT_MSG"

# Dá push para o repositório remoto na branch atual
git push
