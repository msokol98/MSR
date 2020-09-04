import React, {useState} from 'react';
import 'bulma/css/bulma.css'
import BrakeRepair from "./content/BrakeRepair";
import OilChange from "./content/OilChange";
import Transmission from "./content/Transmission";
import TireRotation from "./content/TireRotation";

const Services = () => {

    const services = {
        brakeRepair: "Brake Repair",
        oilChange: "Oil Change",
        transmission: "Transmission",
        tireRotation: "Tire Rotation"
    }

    const [activeComponent, setActiveComponent] = useState(services.brakeRepair);

    const showActiveComponent = () => {
        const { brakeRepair, oilChange, transmission, tireRotation } = services;

        switch(activeComponent) {
            case brakeRepair: return <BrakeRepair />
            case oilChange: return <OilChange />
            case transmission: return <Transmission />
            case tireRotation: return <TireRotation />
        }
    }

    return ( 
        <div className="container">

            <div className="centered">
                <h3 className="title has-text-weight-light">Our Services</h3>
            </div>

            <div className="tabs is-centered is-medium is-boxed">
                <ul>
                    <li onClick={() => setActiveComponent(services.brakeRepair)} 
                        className={activeComponent === services.brakeRepair && "is-active"}>
                        <a>
                            {services.brakeRepair}
                        </a>
                  </li>

                    <li onClick={() => setActiveComponent(services.oilChange)} 
                        className={activeComponent === services.oilChange && "is-active"}>
                        <a>
                            {services.oilChange}
                        </a>
                  </li>

                    <li onClick={() => setActiveComponent(services.tireRotation)}
                        className={activeComponent === services.tireRotation && "is-active"}>
                        <a>
                            {services.tireRotation}
                        </a>
                  </li>

                    <li onClick={() => setActiveComponent(services.transmission)}
                        className={activeComponent === services.transmission && "is-active"}>
                        <a>
                            {services.transmission}
                        </a>
                  </li>
                </ul>
            </div>

            <div className="content">
                <div style={{margin: "0 auto", width: "66%", fontSize: "1.2rem"}}>
                    {showActiveComponent()}
                </div>
            </div>
        </div>
     );
}

 
export default Services;