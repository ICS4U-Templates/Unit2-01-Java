#!/bin/bash

# always run on new instance
cp ./.devcontainer/.bashrc ~/.bashrc
# shellcheck disable=SC1090
source ~/.bashrc

# change welcome message
sudo cp ./.devcontainer/welcome.txt /usr/local/etc/vscode-dev-containers/first-run-notice.txt
