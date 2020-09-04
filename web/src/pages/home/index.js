import React, {Fragment} from 'react';
import 'bulma/css/bulma.css'
import "bulma-divider/dist/css/bulma-divider.min.css";
import Services from "components/services";

const home = () => {
  return (
    <Fragment>

      <section className="hero is-medium red">
        <div className="hero-body">
          <div className="container">

            <div className="hero-inner">

              <div>
                <h2 className="title has-text-white">Sokol Auto Care</h2>
                <h6 className="subtitle has-text-white">Honest repair service right here in the Triangle.</h6>
              </div>

              <img src="repair.png" alt="logo" width="256"  />
            </div>

          </div>
        </div>          
      </section>

      <section className="section has-background-white">
        <Services />
      </section>

      <section className="section has-background-light">
        <div className="container">
          <div className="content">

            <div className="columns is-variable is-7">
              <div className="column">
                <div className="notification has-background-white bordered">
                  <div className="home-icon-wrapper">
                    <img src="money.png" alt="money" width="75"/>
                  </div>                  
                  <h3 className="title has-text-weight-light">Low Prices</h3>
                  <h5 className="subtitle has-text-grey has-text-weight-light">We'll keep your wallet happy.</h5>
                  <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum vehicula suscipit mauris et gravida. Vestibulum id tristique neque.</p>
                </div>
              </div>

              <div className="column">
              <div className="notification has-background-white bordered">
                  <div className="home-icon-wrapper">
                    <img src="clock.webp" alt="money" width="75"/>
                  </div>
                  <h3 className="title has-text-weight-light">Quick Service</h3>
                  <h5 className="subtitle has-text-grey has-text-weight-light">Your car will be ready in no time.</h5>
                  <p>Morbi ut orci vel ligula tristique finibus. In efficitur pulvinar rhoncus. Sed sed nulla vehicula, dignissim leo convallis, sollicitudin arcu.</p>
                </div>
              </div>

              <div className="column">
              <div className="notification has-background-white bordered">
                  <div className="home-icon-wrapper">
                    <img src="honesty.png" alt="money" width="75"/>
                  </div>                  
                  <h3 className="title has-text-weight-light">Honest Work</h3>
                  <h5 className="subtitle has-text-grey has-text-weight-light">Family-friendly service for the community.</h5>
                  <p>Vestibulum suscipit massa lorem, ultricies suscipit sem vestibulum vel. Cras ultricies nisi nunc, eget congue arcu porta id.</p>
                </div>
              </div>
            </div>

          </div>
        </div>          
      </section>
      <section className="section has-background-white">
        <div className="container">
          <div className="content">
            <h2 className="title has-text-weight-light">Customers are saying...</h2>

            <article className="media testimonial">
              <figure className="media-left testimonial-person-icon" >
                <p className="image is-64x64">
                  <img src="person.png" alt="person" />
                </p>
                <div>Mike S.</div>
              </figure>
              <div className="media-content">
                <blockquote>
                      Sokol Auto Care is where I go when I need quick, honest service. It is a friendly environment, and the prices are fair.
                      Supporting a local business that cares about the community is a nice bonus, too! I strongly reccomend checking it out.
                </blockquote>
              </div>
            </article>

            <article className="media testimonial">
              <figure className="media-left testimonial-person-icon">
                <p className="image is-64x64">
                  <img src="person2.png" alt="person2" />
                </p>
                <div>Wendy E.</div>
              </figure>
              <div className="media-content">
                <blockquote>
                      My transmission broke last month in my beloved Acura TL. A big-company, national competitor gave me a price quote so high I could
                      not believe it. I'm glad I chose to come to Sokol Auto Care. They saved me money and got the job done quick!
                </blockquote>
              </div>
            </article>

          </div>
        </div>
      </section>

      <section className="section red">
        <div className="container">
          <div className="content has-text-centered">

            <div className="serving-nc-wrapper" >

              <div className="serving-nc">
                <img src="nc.png" alt="nc" width="200" className="nc-image"/>

                <div>
                  <h3 className="title has-text-weight-normal has-text-white serving-nc-label">Proudly serving the Triangle region.</h3>
                  <h4 className="subtitle has-text-weight-normal has-text-white">Looking for auto repair services? Come see us!</h4>
                </div>
              </div>

              <div className="is-divider" data-content="OR"></div>

              <button className="button is-dark">Make an account</button>
            </div>


          </div>
        </div>
      </section>

      <footer className="footer">
        <div className="container">
          <div className="content">
            <div className="columns">
              <div className="column">
                <h6 className="subtitle has-text-grey">Location</h6>

                <div>511A Pinebluff Trail</div>
                <div>Chapel Hill, NC</div>
              </div>

              <div className="column">
                <h6 className="subtitle has-text-grey">Contact</h6>

                <div>919-791-5823</div>      
                <div>contact@sokolmechanics.com</div>
              </div>

              <div className="column">
                <h6 className="subtitle has-text-grey">Services</h6>

                <div>Oil Change</div>
                <div>Tire Rotation</div>
                <div>Transmission</div>
                <div>Brake Repair</div>
              </div>

              <div className="column">
                <h6 className="subtitle has-text-grey">Account</h6>

                <a href="/login">Sign In</a>
                <br></br>
                <a href="/register">Sign Up</a>
              </div>
            </div>
          </div>

          <div className="is-divider" data-content=""></div>

          <div style={{textAlign: "left"}}>Website by Mitchell Sokol - Personal Project 2020
            <br/>Made with React, Bulma, and Java Spring Boot
            <br/>Deployed onto the web using an AWS EC2 RHEL instance
          </div>

        </div>
      </footer>
    </Fragment>
  );
}

export default home;
