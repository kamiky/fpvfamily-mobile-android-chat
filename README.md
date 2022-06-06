# fpvfamily-mobile-android-chat

Testing the creation of a NPM Native Library for React Native project 

## Installation 

The npm package is not published but you can install it from github.

- In `package.json` add the dependency with `COMMIT_ID` the commit you need to use

`"fpvfamily-mobile-android-chat": "https://github.com/amandin88/fpvfamily-mobile-android-chat.git#COMMIT_ID"`


## Init the library

Before being able to use the library, do the following steps

- In `MainApplication.java` of the React Native project `PROJECT_NAME\android\app\src\main\java\PACKAGES_NAME\`, 
- Import the library and Add `packages.add(new MessageListPackage());` inside the `getPackages()` function as below


```js
import com.nativemessagelist.MessageListPackage;

// ...

 @Override
  protected List<ReactPackage> getPackages() {
    @SuppressWarnings("UnnecessaryLocalVariable")
    List<ReactPackage> packages = new PackageList(this).getPackages();
    packages.add(new MessageListPackage());
    return packages;
  }
```


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
    isScrollEnabled = { true }
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
