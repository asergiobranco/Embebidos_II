PATH_TO_DIR=""
MY_USERNAME=""
cd PATH_TO_DIR
git clone https://github.com/asergiobranco/Embebidos_II.git
cd Embebidos_II
git checkout -b $MY_USERNAME
git add -A
git commit -a -m "Initial"
git push origin $MY_USERNAME
