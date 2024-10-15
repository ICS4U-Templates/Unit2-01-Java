sudo apt-get update
sudo apt upgrade -y
wget https://github.com/charmbracelet/vhs/releases/download/v0.7.2/vhs_0.7.2_amd64.deb
sudo mkdir /usr/share/fonts/truetype/ComicMono
sudo cp ./ComicMono.ttf /usr/share/fonts/truetype/ComicMono
# install ttyd
sudo apt-get install -y build-essential cmake git libjson-c-dev libwebsockets-dev
git clone https://github.com/tsl0922/ttyd.git
cd ttyd && mkdir build && cd build
cmake ..
make && sudo make install
cd ..
cd ..
sudo rm -r ./ttyd
sudo apt install ffmpeg -y
sudo apt install ./vhs_0.7.2_amd64.deb -y
sudo rm ./vhs_0.7.2_amd64.deb
