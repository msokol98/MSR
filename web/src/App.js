import React from 'react';
import './App.css';
import { BrowserRouter as Router, Switch, Route } from "react-router-dom";

import Navbar from "components/navbar";
import Home from "pages/home";

function App() {
  return (
    <div className="App">

      <Navbar />

      <Router>
        <Switch>
          <Route exact={true} path="/" component={Home} />
        </Switch>
      </Router>

    </div>
  );
}

export default App;
