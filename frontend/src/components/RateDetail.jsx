import { useEffect, useState } from "react";
import { useParams, Link } from "react-router-dom";

function RateDetail() {

    const { id } = useParams();

    const [rate, setRate] = useState(null);

    useEffect(() => {

        fetch("http://localhost:8080/api/rates?usedb=true")
            .then(response => response.json())
            .then(data => {

                const foundRate =
                    data.find(item => item.id === Number(id));

                setRate(foundRate);
            });

    }, [id]);

    if (!rate) {
        return <h2>Loading...</h2>;
    }

    return (

        <div className="detail-container">

            <h1>{rate.shortName}</h1>

            <div className="detail-card">

                <p><strong>Country:</strong> {rate.country}</p>
                <p><strong>Name:</strong> {rate.name}</p>
                <p><strong>Current Mid:</strong> {rate.currMid}</p>
                <p><strong>Buy:</strong> {rate.currBuy}</p>
                <p><strong>Sell:</strong> {rate.currSell}</p>
                <p><strong>Amount:</strong> {rate.amount}</p>
                <p><strong>Valid From:</strong> {rate.validFrom}</p>

            </div>

            <Link to="/">
                ← Back
            </Link>

        </div>
    );
}

export default RateDetail;