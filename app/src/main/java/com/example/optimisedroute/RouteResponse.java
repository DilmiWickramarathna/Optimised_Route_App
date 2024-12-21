package com.example.optimisedroute;

import java.util.List;

public class RouteResponse {
    private List<Route> routes;

    public List<Route> getRoutes() {
        return routes;
    }

    public void setRoutes(List<Route> routes) {
        this.routes = routes;
    }

    // Define the Route class that represents each route
    public static class Route {
        private List<Double> geometry;
        private double distance;
        private double duration;

        public List<Double> getGeometry() {
            return geometry;
        }

        public void setGeometry(List<Double> geometry) {
            this.geometry = geometry;
        }

        public double getDistance() {
            return distance;
        }

        public void setDistance(double distance) {
            this.distance = distance;
        }

        public double getDuration() {
            return duration;
        }

        public void setDuration(double duration) {
            this.duration = duration;
        }
    }
}
