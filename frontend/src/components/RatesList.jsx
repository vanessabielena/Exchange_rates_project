import { useEffect, useState } from "react";
import { useNavigate } from "react-router-dom";

function RatesList() {

    const [rates, setRates] = useState([]);
    const navigate = useNavigate();

    useEffect(() => {

        fetch("http://localhost:8080/api/rates?usedb=false")
            .then(response => response.json())
            .then(data => {
                setRates(data);
            });

    }, []);

    return (
        <div className="container">

            <h1>Exchange Rates</h1>

            <table className="rates-table">

                <thead>
                    <tr>
                        <th>Currency</th>
                        <th>Country</th>
                        <th>Rate</th>
                    </tr>
                </thead>

                <tbody>

                    {rates.map((rate) => (

                        <tr
                            key={rate.id}
                            onClick={() => navigate(`/detail/${rate.id}`)}
                        >
                            <td>{rate.shortName}</td>
                            <td>{rate.country}</td>
                            <td>{rate.currMid}</td>
                        </tr>

                    ))}

                </tbody>

            </table>

        </div>
    );
}

export default RatesList;