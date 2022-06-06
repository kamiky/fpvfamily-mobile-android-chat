import { StatusBar } from 'expo-status-bar';
import React from 'react';
import { StyleSheet, Text, View } from 'react-native';
import MessageList from 'fpvfamily-mobile-android-chat';


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
  return (
    <View style={styles.container}>
      <MessageList 
        style={{ flex: 1, width: '100%', height: '100%' }} 
        listing = {JSON.stringify(movielistData)}
      isScrollEnabled = {true}
      />
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: '#fff',
    alignItems: 'center',
    justifyContent: 'center',
  },
});
