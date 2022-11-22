import Card from '@mui/material/Card';
import CardActions from '@mui/material/CardActions';
import CardContent from '@mui/material/CardContent';
import CardMedia from '@mui/material/CardMedia';
import Button from '@mui/material/Button';
import Typography from '@mui/material/Typography';



export default function MediaCard() {
  return (
    <Card sx={{ maxWidth: 345, position: 'absolute', left:400, top: 100, borderRadius: 5 }}>
      <CardMedia
        component="img"
        height="140"
        image = "images/chips.png"
        alt="green iguana"
      />
      <CardContent sx={{ color: 'white', backgroundColor: '#36393F'}}>
        <Typography gutterBottom variant="h5" component="div"  sx={{fontFamily: 'Montserrat', fontWeight: 700}}>
          Nacho Chips
        </Typography>
        <Typography variant="body2" color="white" sx={{fontFamily: 'Montserrat'}}>
        made from corn tortillas, which are cut into triangles and then fried or baked. Corn tortillas are made of nixtamalized corn,
        </Typography>
      </CardContent>
      <CardActions sx={{ color: 'white', backgroundColor: '#36393F'}}>
        <Button variant="contained" sx={{ color: 'white', backgroundColor: '#7289DA', left: 107, fontFamily: 'Montserrat', fontWeight: 700, bottom:5 }}>Order Now</Button>
      </CardActions>
    </Card>
  );
}