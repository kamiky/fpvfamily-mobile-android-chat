import PropTypes from 'prop-types';
import { requireNativeComponent } from 'react-native';
import {ViewPropTypes} from 'deprecated-react-native-prop-types';
var viewProps = {
  name: 'MessageList',
  propTypes: {
    ...ViewPropTypes
  }
}
module.exports = requireNativeComponent('MessageList', viewProps);