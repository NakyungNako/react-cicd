module.exports = {
    "transform": {
      "^.+\\.jsx?$": "babel-jest"
    },
    "moduleNameMapper": {
        "axios": "axios/dist/node/axios.cjs"
    },
    "testEnvironment": "jsdom",
    "globals":{
      "google": {
      }
    }
};