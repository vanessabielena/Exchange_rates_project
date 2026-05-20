import { BrowserRouter, Routes, Route } from "react-router-dom";

import RatesList from "./components/RatesList";
import RateDetail from "./components/RateDetail";

import "./index.css";

function App() {

  return (

    <BrowserRouter>

      <Routes>

        <Route
          path="/"
          element={<RatesList />}
        />

        <Route
          path="/detail/:id"
          element={<RateDetail />}
        />

      </Routes>

    </BrowserRouter>
  );
}

export default App;