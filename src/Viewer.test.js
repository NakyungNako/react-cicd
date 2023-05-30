import React from "react";
import { render, screen } from "@testing-library/react";
import Viewer from "./components/Viewer";
import { BrowserRouter as Router } from "react-router-dom";
import "@testing-library/jest-dom";

test("renders learn react link", () => {
  render(
    <Router>
      <Viewer />
    </Router>
  );
  const linkElement = screen.getByText(/Join Room/i);
  expect(linkElement).toBeInTheDocument();
});
