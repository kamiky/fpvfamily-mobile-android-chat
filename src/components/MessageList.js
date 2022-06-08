import React, { useState, useEffect, forwardRef, useImperativeHandle } from 'react';
import { requireNativeComponent } from 'react-native';

const MessageListNative = requireNativeComponent('MessageList');

const MessageList = (props, ref) => {
    const [scrollEnabled, setIsScrollable] = useState(props.scrollEnabled);

    useImperativeHandle(ref, () => ({
        getScrollEnabled: () => { return scrollEnabled;}
      }))

    useEffect(() => {
        setIsScrollable(props.scrollEnabled);
    }, [props.scrollEnabled]);

    return (
        <MessageListNative 
          style={props.style} 
          listing = {props.listing}
          scrollEnabled = {scrollEnabled}
        />
    )
}

export default forwardRef(MessageList);