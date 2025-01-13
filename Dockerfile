FROM henrotaym/openjdk:23

COPY ./src ./src
COPY ./devops ./devops

CMD [ "./devops/start.sh" ]
