package com.company.repositories;

import com.company.models.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UsersRepositoryJdbcImpl implements UsersRepository {
    private Connection connection;

    public UsersRepositoryJdbcImpl(Connection connection) {
        this.connection = connection;
    }

    private RowMapper<User> userRowMapper = rs ->
            new User(
                    rs.getInt("id"),
                    rs.getString("username"),
                    rs.getString("password")
            );

    @Override
    public Optional<User> findOneByUsername(String username) {
        String sqlQuery = "SELECT * FROM shop_user " +
                "WHERE username = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sqlQuery)) {
            stmt.setString(1, username);
            try (ResultSet rs = stmt.executeQuery()) {
                User u = null;
                if (rs.next()) {
                    u = userRowMapper.mapRow(rs);
                }
                return Optional.ofNullable(u);
            }
        } catch (SQLException e) {
            throw new IllegalStateException(e);
        }
    }


        @Override
        public void save (User user){
            String sqlQuery = "INSERT INTO shop_user(id, username, password)\n" +
                    "VALUES (? , ? , ?);";
            try (PreparedStatement stmt = connection.prepareStatement(sqlQuery)) {
                String username = user.getUsername();
                String password = user.getPassword();
                int id = user.getId();
                stmt.setInt(1, id);
                stmt.setString(2, username);
                stmt.setString(3, password);
                stmt.executeUpdate();
            } catch (SQLException e) {
                throw new IllegalStateException(e);
            }
        }


        public void update (User user){

            String sqlQuery = "UPDATE shop_user SET username = ?, password = ? WHERE id = ?";

            try (PreparedStatement stmt = connection.prepareStatement(sqlQuery)) {

                int id = user.getId();

                String username = user.getUsername();

                String password = user.getPassword();

                stmt.setString(1, username);

                stmt.setString(2, password);

                stmt.setInt(3, id);

                stmt.executeUpdate();

            } catch (SQLException e) {

                throw new IllegalArgumentException(e);

            }
        }

        @Override
        public Optional<User> find (Integer id){
            String sqlQuery = "SELECT * FROM shop_user " +
                    "WHERE id = ?";
            try (PreparedStatement stmt = connection.prepareStatement(sqlQuery)) {
                stmt.setInt(1, id);
                try (ResultSet rs = stmt.executeQuery()) {
                    User u = null;
                    if (rs.next()) {
                        u = userRowMapper.mapRow(rs);
                    }
                    return Optional.ofNullable(u);
                }
            } catch (SQLException e) {
                throw new IllegalStateException(e);
            }
        }

        public void delete (User user){
            String sqlQuery = "DELETE FROM shop_user WHERE username = ?";
            try (PreparedStatement stmt = connection.prepareStatement(sqlQuery)) {
                String username = user.getUsername();
                stmt.setString(1, username);
                stmt.executeUpdate();
            } catch (SQLException e) {
                throw new IllegalStateException(e);
            }
        }

        @Override
        public List<User> findAll () {
            String sqlQuery = "SELECT * FROM shop_user";
            try (Statement stmt = connection.createStatement();
                 ResultSet rs = stmt.executeQuery(sqlQuery)) {
                List<User> users = new ArrayList<>();
                while (rs.next()) {
                    users.add(userRowMapper.mapRow(rs));
                }
                return users;
            } catch (SQLException e) {
                throw new IllegalStateException(e);
            }
        }
    }
}