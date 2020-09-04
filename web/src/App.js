import React from 'react';
import './App.css';
import { BrowserRouter as Router, Switch, Route } from "react-router-dom";

import Navbar from "components/navbar";
import Home from "pages/home";
import Portal from "pages/portal";

function App() {
  return (
    <div className="App">

      <Navbar />

      <Router>
        <Switch>
          <Route exact={true} path="/" component={Home} />

          <div style={{padding: '5%'}}>
            <Route exact={true} path="/portal" component={Portal} />
          </div>

        </Switch>
      </Router>

    </div>
  );
}

export default App;
