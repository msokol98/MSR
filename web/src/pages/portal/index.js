import React, {Component} from 'react';
import axios from 'axios';
import apiHost from 'config';

class Portal extends Component {
    state = { 

    }

    componentDidMount() {
        axios.get(`${apiHost}/persons`)
            .then(response => console.log(apiHost, response.data));
    }

    render() { 
        return ( 
            <div>Test</div>
         );
    }
}
 
export default Portal;