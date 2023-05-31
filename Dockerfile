FROM node:20-slim as build
ENV REACT_APP_SERVER_URL=https://clumsy-calf-wear.cyclic.app
ENV REACT_APP_SOCKET_URL=https://server-socket-1.onrender.com
ENV REACT_APP_JOIN_URL=http://188.166.184.241:8080/joingroup/
ENV REACT_APP_GOOGLE_CLIENT_ID=928334714268-aaf2jdfggggj1npbo7abi6bu4p3.apps.googleusercontent.com
WORKDIR /app
COPY . /app
RUN npm install && npm run build

FROM nginx:latest
COPY --from=build /app/build /usr/share/nginx/html