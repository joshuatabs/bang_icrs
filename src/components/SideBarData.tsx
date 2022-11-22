import React from "react";
import FastfoodIcon from '@mui/icons-material/Fastfood';
import LocalDiningIcon from '@mui/icons-material/LocalDining';
import LocalDrinkIcon from '@mui/icons-material/LocalDrink';


export const SidebarData = [
    
  {
    title: "Fingerfood",
    path: "/fingerfood",
    icon: <FastfoodIcon></FastfoodIcon>
  },

  {
    title: "Meals",
    path: "/meals",
    icon: <LocalDiningIcon></LocalDiningIcon>
  },
  {
    title: "Drinks",
    path: "/drinks",
    icon: <LocalDrinkIcon></LocalDrinkIcon>
  },
 
];