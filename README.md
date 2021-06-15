# Legendary Totem

Legendary totem is a Kotlin application made during my internship at CityLegends.

The legendary totem is a screen on which content shows which users uploaded from a website to a server. The totem will scan for new videos and play them.

## Installation

Install the latest version of [Android Studio](https://developer.android.com/studio).


## Usage

Clone the repo and open the project folder in Android Studio.

## Contributing
There are some features to be made. I will explain in more detail below. I have diveded the features in several prototypes, these are based on the research I did during my Internship.

Please make sure to update tests as appropriate.

How everything needs to be implemented is already researched and CityLegends has the documentation. Also feel free to ask me questions about the project!

### Version 1 (Current)

Standalone Android app which randomly plays videos from the `/raw/` folder inside of the app. 
1. Automatically play a video from start up.
2. Automatically play another video after video completion.
3. New video can't be the same as just completed video.

![first-prototype](https://i.imgur.com/bcoranS.gif)

### Version 2

Instead of the videos playing from the `/raw/` folder they will be streamed from the CityLegends server (CentOS) This will be done using MongoDB. 

Carefull to not throw away the code for the `/raw/ ` folder. This will be used later again

### Version 3

Streaming every video will cost a lot of bandwidth. This is solvable by checking for new videos and downloading the new videos to the `/raw/` folder. 

At this stage the code for reading the files also needs to be changed. Right now it is still in a list but to future proof it for new video's you will need to make a function that reads all the .mp4 files from the `/raw/` directory.

### Version 4

The fourth stage will focus on building the web page for the users. Again, What and how it should be implemented is already researched, CityLegends will provide you this information.

### Version 5

This version will focus on some quality of life features.

1. Give the users an option to add a name (or get the name from the CityLegends app) and show them at their video.
2. Add transition effects between videos.

### Version 6

The sixth and last version looks into adding the QR-code.

1. Generate a unique QR-code for every user.
2. Track how many times a QR-code is scanned and show it just like you show the username of the user during their video.
