db.createUser(
    {
      user: "order",
      pwd: "order",
      roles: [
        {
          role: "readWrite",
          db: "kitchen-database"
        }
      ]
    }
);