import React, { useRef } from 'react';
import { StyleSheet, View, Button, ToastAndroid } from 'react-native';

import  MessageList  from 'fpvfamily-mobile-android-chat';

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
},
{
  name : "Boys",
  director : "Shankar",
  year : 2003,
  image : "https://upload.wikimedia.org/wikipedia/en/0/0f/Enthiran_poster.jpg"
},
{
  name : "Kadhalan",
  director : "Shankar",
  year : 1996,
  image : "https://upload.wikimedia.org/wikipedia/en/0/0f/Enthiran_poster.jpg"
},
{
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
},
{
  name : "Boys",
  director : "Shankar",
  year : 2003,
  image : "https://upload.wikimedia.org/wikipedia/en/0/0f/Enthiran_poster.jpg"
},
{
  name : "Kadhalan",
  director : "Shankar",
  year : 1996,
  image : "https://upload.wikimedia.org/wikipedia/en/0/0f/Enthiran_poster.jpg"
}]

export default function App() {
  const messageListRef = useRef();

  return (
    <View style={styles.appContainer}>
      <View style={styles.messageListContainer}>
        <MessageList 
          ref={messageListRef}
          style={styles.messageList} 
          listing = {JSON.stringify(movielistData)}
          scrollEnabled = {true}
        />
      </View>

      <Button 
        title='Call getScrollEnabled()'
        onPress={() => 
          ToastAndroid.show(
            ('MessageList is scrollable: ' + messageListRef.current.getScrollEnabled()), 
            ToastAndroid.SHORT
            )} />
    </View>
  );
}

const styles = StyleSheet.create({
  appContainer: {
    width: '100%', 
    height: '100%',
    display: 'flex',
    alignItems: "center",
    backgroundColor: "black"
  },
  messageListContainer: {
    width: '90%', 
    height: '50%',
    marginBottom: "5%",
    backgroundColor: "darkgrey"
  },
  messageList: {
    height: '50%',
    marginLeft: 20
  }
});
