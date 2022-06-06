# fpvfamily-mobile-android-chat

Testing the creation of a NPM Native Library for React Native project 

## Installation 

The npm package is not published but you can install it from github.

- In `package.json` add the dependency with `COMMIT_ID` the commit you need to use

`"fpvfamily-mobile-android-chat": "https://github.com/amandin88/fpvfamily-mobile-android-chat.git#COMMIT_ID"`


## Init the library

## Usage


```js
import MessageList from 'fpvfamily-mobile-android-chat';

// ...
var movielistData = [{
  name : "The Robot",
  director : "Shankar",
  year : 2010,
  image : "https://upload.wikimedia.org/wikipedia/en/0/0f/Enthiran_poster.jpg"
},
{
  name : "Nanban",
  director : "Shankar",
  year : 2012,
  image : "https://upload.wikimedia.org/wikipedia/en/0/0f/Enthiran_poster.jpg"
}]

// ...

<MessageList 
    style={styles.messageList} 
    listing = {JSON.stringify(movielistData)}
    scrollEnabled = { true }
  />
      
// ...

const styles = StyleSheet.create({
  // ...
  messageList: {
    height: '50%',
    marginLeft: 20
  },
});
```
