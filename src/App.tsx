import React from 'react';
import logo from './logo.svg';
import './App.css';
import { Button, Avatar} from '@mui/material';
import ResponsiveAppBar from './components/navbar';
import Sidebar from './components/sidebar';
import MediaCard from './components/MenuCard';
import Card, { CardDetails } from './components/MainMenuFoodCard';

const FoodMenu:CardDetails[] = [
  {title:'Finger Foods', image:'/static/images/chips.png', description:'Reserve a Broadcasting PC for streaming!'},
  {title:'Meals', image:'/static/images/sisig.png', description:'Schedule the date of reserving the whole venue!'},
  {title:'Drinks', image:'/static/images/coke.png', description:'Select supported payment methods to pay for your reservation!'},
]

function App() {
  return (
    <div className="App">
        <ResponsiveAppBar></ResponsiveAppBar>

        <header className="App-header">

        <h1 style={{width:700, fontFamily: 'Montserrat', fontWeight:800, fontStyle: 'bold',}}> The best gamers require the greatest meals</h1>
        <h5 style={{fontWeight:400, fontFamily: 'Montserrat'}}>Games | Food | Experience</h5>
        <br></br>
        <Button variant="contained" sx={{ borderRadius: 5,color: 'white', backgroundColor: '#7289DA', right: 10, fontFamily: 'Montserrat', fontWeight: 'bold', bottom:50, height:70, width:275}}><h1>Explore Menu</h1></Button>

        <div className='CARDS'>
          {FoodMenu.map((item, i)=>
            <Card key={i} title={item.title} image={item.image} description={item.description}/>
          )}
        </div>

      </header>
        

    </div>
  );
}

export default App;
