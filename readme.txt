A simple sports tournament management system built in Java and Rest Api Home page controller class calls and the Rest metods of DB Helper, which has the backend logic. 
Sports class is the base class The classes VolleyBall,FootBall extends the base class Sports. Sports holds the maximum number of registrations of each sports. 
Team class holds the team name , corresponding sports and number of participants. 
Methods create team, register individual, participant, add team members,update team member deregister sport, deregister team are called using the @request mapping annotation (spring boot rest). 
Check for registration limit , min max participants , max 3 participants are implemented