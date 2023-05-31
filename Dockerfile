FROM node:20-slim as build
ENV REACT_APP_SERVER_URL=http://localhost:4000
ENV REACT_APP_SOCKET_URL=http://localhost:4001
ENV REACT_APP_JOIN_URL=http://localhost:3000/joingroup/
ENV REACT_APP_GOOGLE_CLIENT_ID=928334714268-aaf2jdfggggj1npbo7abi6bu4p3.apps.googleusercontent.com
WORKDIR /app
COPY . /app
RUN npm install && npm run build

FROM nginx:latest
COPY --from=build /app/build /usr/share/nginx/html
COPY default.conf /etc/nginx/conf.d/default.conf
COPY nginx.conf /etc/nginx/nginx.conf