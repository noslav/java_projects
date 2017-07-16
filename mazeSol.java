while (notDone()) 
{
  if (isPathLeft()) 
  {
    turnLeft();
    if (isPathForward()) 
    {
      moveForward();
    }
  }
  if (isPathForward()) 
  {
    moveForward();
  } 
  else 
  {
    turnRight();
    if (isPathForward()) 
    {
      moveForward();
    }
  }
}