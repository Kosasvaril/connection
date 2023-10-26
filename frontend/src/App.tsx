import { useEffect, useState } from 'react';
import axios from 'axios';
import './App.css'

function App() {
  const [message, setMessage] = useState('');

  useEffect(()=>{
    axios.get('http://localhost:8080/demostore/main')
      .then(response =>{
        console.log("VÁLASZ")
        setMessage(response.data)
      })
      .catch(error =>{
        console.error(error);
      })
  },[])

  return (
    <>
      <div className='App'>
        <h1>SEMMI</h1>
        <h1>{message}</h1>
      </div>
    </>
  )
}

export default App
